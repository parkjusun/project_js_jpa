
"use strict"

var admin = admin || {}

admin = (() => {
    let init = () => {
        onCreate()
    }
    let onCreate = () => {
        let reset = 0;
        setContentView()

        $('#userList').click(e => {
            $("#userList").addClass('active')
            $("#adminList").removeClass('active')
            $("#userid").text('아이디')
            $("#ssn").text('주민번호')
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

                    $(`<a>${j.name}</a>`)
                        .css({ cursor: 'pointer', color: 'blue' })
                        .appendTo("#user_" + (i + 1))
                        .click(e => {
                            for (let z = 0; z < d.length + 1; z++) {
                                $("#list_" + (z)).remove()
                            }

                            $(`<tr id="list_` + (i) + `">
                        	<td>
                                <span>${i + 1}</span>
                            </td>
                            <td>
                                <span>${j.userId}</span>
                            </td>
                            <td>
                                <span>${j.name}</span>
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


                        })


                })
            })
        })
        $('#adminList').click(e => {
            $("#adminList").addClass('active')
            $("#userList").removeClass('active')
            // 리스트 이름 변경
            $("#userid").text('사원번호')
            $("#ssn").text('직급')
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
                        
                        // 리스트 갯수 저장
                        reset = d.length;

                    $(`<a>${j.name}</a>`)
                        .css({ cursor: 'pointer', color: 'blue' })
                        .appendTo("#user_" + (i + 1))
                        .click(e => {
                            for (let z = 0; z < d.length + 1; z++) {
                                $("#list_" + (z)).remove()
                            }

                            $(`<tr id="list_` + (i) + `">
                        	<td>
                                <span>${i + 1}</span>
                            </td>
                            <td>
                                <span>${j.employNumber}</span>
                            </td>
                            <td>
                                <span>${j.name}</span>
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


                        })


                })

            })

        })


    }
    let setContentView = () => {
        $('#userData tr').first().css({ 'background-color': 'yellow' })
    }
    return { init }

})()