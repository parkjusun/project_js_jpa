"use strict"
var userVue = {
	detail: () => {
		return `
		<table id="admin" style="width: 80%; height:80%; margin: 0 auto">
					<tr style="width: 80%;height: 50px;">
						<td rowspan="4">
							<img src="https://visualpharm.com/assets/314/Admin-595b40b65ba036ed117d36fe.svg" style="height: 100%; width: 100%;">
						</td>
						<td style="height: 20%">
							<label>이름</label>
						</td>
						<td>
							<input id="name" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td>
							<label>직급</label>
						</td>
						<td>
							<input id="position" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td>
							<label>이메일</label>
						</td>
						<td>
							<input id="email" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td>
							<label>전화번호aa</label>
						</td>
						<td>
							<input id="phoneNumber" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td colspan="3">
							<input id="admin_join" type="button" value="등록하기"
								style="width: 200px; height: 100px;font-size: 30px;" />
							<input id="userid" type="button" value="취소하기"
								style="width: 200px; height: 100px;margin-left: 50px;font-size: 30px;" />
						</td>
					</tr>
				</table>

	     	`
	},

	lostview: () => {
		return `
            	<table id="admin" style="width: 80%; height:80%; margin: 0 auto">
					<tr style="width: 80%;height: 50px;">
						<td rowspan="4">
							<img src="https://visualpharm.com/assets/314/Admin-595b40b65ba036ed117d36fe.svg" style="height: 100%; width: 100%;">
						</td>
						<td style="height: 20%">
							<label>이름</label>
						</td>
						<td>
							<input id="name" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td>
							<label>직급</label>
						</td>
						<td>
							<input id="position" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td>
							<label>이메일</label>
						</td>
						<td>
							<input id="email" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td>
							<label>전화번호</label>
						</td>
						<td>
							<input id="phoneNumber" type="text" />
						</td>
					</tr>
					<tr style="height: 20%">
						<td colspan="3">
							<input id="admin_join" type="button" value="등록하기"
								style="width: 200px; height: 100px;font-size: 30px;" />
							<input id="userid" type="button" value="취소하기"
								style="width: 200px; height: 100px;margin-left: 50px;font-size: 30px;" />
						</td>
					</tr>
				</table>
		`
	}
}