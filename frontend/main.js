

$(document).ready(function(){


    $('#IP_address').on('focusout', function(){

        if($('#IP_address').val() != ""){

           if(validateIp($('#IP_address').val())){

            $('.error').fadeOut('slow');

           }else{
              $('.error').text('Invalid IP...!');
              $('.error').fadeIn('slow');
           }

        }else{
            $('.error').text('IP Required..!');
            $('.error').fadeIn("slow");
        }



    });

});


function validateIp(eVal){
    var val =  /^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/;
    
    if( val.test(eVal)){
        return true;
    }else{
        return false;
    }
}


