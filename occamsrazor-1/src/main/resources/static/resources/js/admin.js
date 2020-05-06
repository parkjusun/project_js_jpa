"use strict"

var admin = admin || {}

admin = (() => {
    const WHEN_ERROR = `호출하는 JS 파일을 찾지 못했습니다.`
    let detailVue
    let lostVue
    let reset

    let init = () => {
        reset = 0;
        detailVue = `/resources/vue/detail_vue.js`
        lostVue = `/resources/vue/lost_vue.js`
        onCreate()
    }
    let onCreate = () => {
        setContentView()

        $('#lostItem').click(e => {
            $("#adminList").removeClass('active')
            $("#userList").removeClass('active')
            $("#lostItem").addClass('active')
            
            $('#userData').html(`
            <tr id="userDetail" >
                            <th>
                                <a id="index">index.</a>
                            </th>
                            <th>
                                <a id="itemName">id</a>
                            </th>
                            <th>
                                <a id="itemName">itemName</a>
                            </th>
                            <th>
                                <a id="itemRegisterDate">itemRegisterDate</a>
                            </th>
                             <th>
                                <a id="classify">classify</a>
                            </th>
                           <th>
                                <a id="location">location</a>
                            </th>
                  </tr> `)

            $.getJSON('/lostItem/list', d => {
                console.log('aaa');

                $('#totalCount').text('물품수 : ' + d.length)
                // 초기화
                for (let z = 0; z < reset; z++) {
                    $("#list_" + z).remove()
                }
                //리스트 표시
                $.each(d, (i, j) => {

                    $(`<tr id="list_` + (i) + `">
                            <td>
                                <span>${i + 1}</span>
                            </td>
                            <td>
                                 <span>${j.index}</span>
                            </td>
                            <td>
                                 <span>${j.itemName}</span>
                            </td>
                            <td>
                               <span>${j.itemRegisterDate}</span>
                            </td>
                             <td>
                                <span>${j.classify}</span>
                            </td>
                           <td>
                               <span>${j.location}</span>
                            </td>
                        </tr>`).appendTo('#userData')

                    // 리스트 갯수 저장
                    reset = d.length;
                    console.log(reset);


                })
            })

        })

        $('#userList').click(e => {
            $("#userList").addClass('active')
            $("#adminList").removeClass('active')
            $("#lostItem").removeClass('active')
            $('#LostData').empty()
            $("#userid").text('아이디')
            $("#ssn").text('주민번호')
            $("#content_container").remove()
            $.when(
                $.getScript(detailVue)
            ).done(() => {
                $.getJSON('/users/list', d => {
                    $('#totalCount').text('총회원수 : ' + d.length)
                    // 초기화
                    for (let z = 0; z < reset; z++) {
                        $("#list_" + z).remove()
                    }
                    //리스트 표시
                    $.each(d, (i, j) => {

                        $(`<tr id="list_` + (i) + `">
                        	<td>
                                <span>${i + 1}</span>
                            </td>
                            <td>
                                <span>${j.userId}</span>
                            </td>
                            <td>
                                <span id="user_`+ (i + 1) + `"></span>
                            </td>
                             <td>
                                <span>${j.ssn}</span>
                            </td>
                           <td>
                                <span>${j.email}</span>
                            </td>
                            <td>
                                <span>${j.phoneNumber}</span>
                            </td>
                            <td>
                                <span>${j.registerDate}</span>
                            </td>
                            
                        </tr>`).appendTo('#userData')

                        // 리스트 갯수 저장
                        reset = d.length;
                        console.log(reset);


                        $(`<a>${j.name}</a>`)
                            .css({ cursor: 'pointer', color: 'blue' })
                            .appendTo("#user_" + (i + 1))
                            .click(e => {
                                $('#userData').empty()
                                $(userVue.detail()).appendTo('#userData')
                                $.getJSON('/users/${j.userId}', d => {
                                    $('#userId').text(d.userId),
                                        $('#name').text(d.name),
                                        $('#userSSN').text(d.ssn),
                                        $('#userAddr').text(d.addr),
                                        $('#userEmail').text(d.email),
                                        $('#userPhoneNumber').text(d.phoneNumber),
                                        $('#registerDate').text(d.registerDate)

                                })


                            })


                    })
                })
            }).fail(() => {
                alert(WHEN_ERROR)
            })

        })




        $('#adminList').click(e => {
            $("#adminList").addClass('active')
            $("#userList").removeClass('active')
            $("#lostItem").removeClass('active')
            $('#LostData').empty()
            $("#content_container").remove()
            // 리스트 이름 변경
            $("#userid").text('사원번호')
            $("#ssn").text('직급')
            $.when(
                $.getScript(detailVue)
            ).done(() => {
                $.getJSON('/admins/list', d => {
                    $('#totalCount').text('총회원수 : ' + d.length)

                    //리스트 초기화
                    for (let z = 0; z < reset; z++) {
                        $("#list_" + (z)).remove()
                    }

                    $.each(d, (i, j) => {
                        $(`<tr id="list_` + (i) + `">
                        	<td>
                                <span>${i + 1}</span>
                            </td>
                            <td>
                                <span>${j.employNumber}</span>
                            </td>
                            <td>
                                <span id="user_`+ (i + 1) + `"></span>
                            </td>
                             <td>
                                <span>${j.position}</span>
                            </td>
                           <td>
                                <span>${j.email}</span>
                            </td>
                            <td>
                                <span>${j.phoneNumber}</span>
                            </td>
                            <td>
                                <span>${j.registerDate}</span>
                            </td>

                        </tr>`).appendTo('#userData')
                        // 리스트 갯수저장 
                        reset = d.length;
                        console.log(reset);

                        $(`<a>${j.name}</a>`)
                            .css({ cursor: 'pointer', color: 'blue' })
                            .appendTo("#user_" + (i + 1))
                            .click(e => {
                                $('#userData').empty()
                                $(userVue.detail()).appendTo('#userData')
                                $.getJSON('/users/${j.userId}', d => {
                                    $('#userId').text(d.userId),
                                        $('#name').text(d.name),
                                        $('#userSSN').text(d.ssn),
                                        $('#userAddr').text(d.addr),
                                        $('#userEmail').text(d.email),
                                        $('#userPhoneNumber').text(d.phoneNumber),
                                        $('#registerDate').text(d.registerDate)

                                })



                            })


                    })

                })


            }).fail(() => {
                alert(WHEN_ERROR)
            })



        })



    }
    let setContentView = () => {
        $('#userData tr').first().css({ 'background-color': 'yellow' })
    }
    return { init }

})()