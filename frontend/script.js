$(document).ready(function() {
   $('#button').on('click',function(){
      getdetails();
   });
  
});
function getdetails(){
   var $id=$('#list');
   $.ajax({
      type:"GET",
      url:"http://localhost:8080/demogetmobile",
      success:function (id){
          console.log(id);
          $.each(id.mobile,function(i,mobile){
              $id.append('<li>mobile:location:'+mobile.location+',type:'+mobile.typr+'</li>')
          });
      }


  });
}
