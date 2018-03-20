function isEquals(item1, item2) {
	item1 = document.getElementById(item1);
	var igual = item1.value == item2.value;
	
	if(!igual){
		item2.focus();
	}
}