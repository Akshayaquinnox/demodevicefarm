function validate() {
    var userName = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    
    console.log("username :: ", userName);
    console.log("password :: " ,password);
    
    if(userName == 'aadhya' && password == 'password')
    {
    location.href ='add.html';
    
    }
    else if(userName == 'akshaya' && password == 'password')
    {
    location.href ='report.html';
    
    }

    else{
    window.alert("Please enter valid details!");
    }
    }
  
  