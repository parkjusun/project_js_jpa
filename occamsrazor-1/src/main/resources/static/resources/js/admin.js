"use strict"
var admin = admin || {}
admin = (() => {
	let init = () => {
		alert('1')
		onCreat()
	}
	
	let onCreat = () => {
		alert('2')
		setContentView()
	}

	let setContentView = () =>{
		alert('3')
	}

	return {init}//클로저
})()
