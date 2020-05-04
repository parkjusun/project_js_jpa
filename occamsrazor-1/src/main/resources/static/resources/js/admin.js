
"use strict"

var admin = admin || {}

admin = (() => {
    let init = () => {
        onCreate()
    }
    let onCreate = () => {
        setContentView()


        $.getJSON('/users/list', d => {
            alert(d.length)
            $('#totalCount').text('총회원수 : ' + d.length)
            $.each(d, (i, j) => {
                $(`<tr>
                        	<td>
                                <span>${i + 1}</span>
                            </td>
                            <td>
                                <span>${j.userId}</span>
                            </td>
                            <td>
                                <span><a id="nameDetail">${j.name}<a></span>
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
    }
    let setContentView = () => {
        $('#userData tr').first().css({ 'background-color': 'yellow' })
    }
    return { init }

})()