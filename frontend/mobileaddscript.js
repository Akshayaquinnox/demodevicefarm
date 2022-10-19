$(document).ready(function(){
$('submit').on('click',function(){

onFormSubmit();
});
})
var selectedRow=null;
function onFormSubmit() {
    var formData = readFormData();
   
        insertNewRecord(formData);
}

function readFormData() {
    var formData = {};
    formData["type"]= document.getElementById("type_of_device").value;
    formData["manufacture"]= document.getElementById("Manufature").value;
    formData['make']= document.getElementById("Make").value;
    formData['model']= document.getElementById("Model").value;
    formData['Os']= document.getElementById("Operating System").value;
    formData['date']= document.getElementById("Date of Purchase").value;
    formData['client']= document.getElementById("Current Client").value;
    formData['deviceid']=document.getElementById("Device Id").value;
    formData['serial']=document.getElementById("Serial Number").value;
    formData['location']=document.getElementById("Location of Hosting").value;
  return formData;
}
function insertNewRecord(data){
    var table=document.getElementById('addlist').getElementsByTagName('tbody')[0];
    var newRow=table.insertRow(table.length);
    cell1=newRow.insertCell(0);
    cell1.innerHTML=data.type;
    cell2=newRow.insertCell(1);
    cell2.innerHTML=data.manufacture(1);
    cell3=newRow.insertCell(2);
    cell3.innerHTML=data.make(2);
    cell4=newRow.insertCell(3);
    cell4.innerHTML=data.model(3);
    cell5=newRow.insertCell(4);
    cell5.innerHTML=data.Os(4);
    cell6=newRow.insertCell(5);
    cell6.innerHTML=data.date(5);
    cell7=newRow.insertCell(6);
    cell7.innerHTML=data.client(6);
    cell8=newRow.insertCell(7);
    cell8.innerHTML=data.deviceid(7);
    cell9=newRow.insertCell(8);
    cell9.innerHTML=data.serial(8);
    cell10=newRow.insertCell(9);
    cell10.innerHTML=data.location();
   // cell10=newRow.insertCell(10);
    //cell10.innerHTML='<a onClick="onEdit(this)">Edit</a>';
    
    
}
function resetForm(td){
    document.getElementById("type_of_device").value="";
    document.getElementById("Manufature").value="";
     document.getElementById("make").value="";
     document.getElementById("model").value="";
    document.getElementById("Operating System").value="";
     document.getElementById("Date of Purchase").value="";
     document.getElementById("Current Client").value="";
   document.getElementById("Device Id").value="";
    document.getElementById("Serial Number").value="";
   document.getElementById("Location of Hosting").value="";
  
}