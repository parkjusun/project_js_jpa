"use strict"
const adminVue = {
	join: () => {
		return `
		 <article>

            <form action="#">
                <label>로그인</label> <br>
                <input id="userid" type="text"> <br>
                <label>비밀번호 </label><br>
                <input id="password" type="text"><br>
                <input id="login-button" type="button" value="로그인">
                <input id="cancl-Button" type="button" value="취소">
            </form>
        </article>

	     	`
	}
}

