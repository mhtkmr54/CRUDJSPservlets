<%-- 
    Document   : DYNAMIC TABLE WEB-APPLICATION
    Created on : Dec 20, 2014, 2:52:59 PM
    Author     : MOHIT KUMAR & HITESH KHANDELWAL ,iit madras
                 
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
        
         <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        
        <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
        
        <script src="jquery.dataTables.min.js"></script>
        
        
          <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css" />
    
    <script src="http://code.jquery.com/ui/1.10.0/jquery-ui.js" type="text/javascript"></script>
   
    <link rel="stylesheet" href="/resources/demos/style.css" />
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="styles.css">
   <link rel="stylesheet" href="tablecss.css">
   <script src="script.js"></script> 
        
    </head>
   
        
       
    <style>
        #main {
    margin: auto;
    width: 400px;
}

#sidebar    {
    width: 25%;
    position: fixed;
    min-height: 400px;
    background: red;
    float: left;
}

#page-wrap  {
   padding-left: 350px;
    width: 75%;
    background: #0f0;
    min-height: 400px;
    float: left;
}

.clear:after {
    clear: both;
    display: table;
    content: "";
}      


   table tfoot {
  background-color: orange;
   text-align: center;
}
    tfoot input {
        width: 100%;
        padding: 3px;
        box-sizing: border-box;
    }
    </style>
    
    
    
    <script>
    
    $(document).ready(function() {
    // Setup - add a text input to each footer cell
    $('#example tfoot th').each( function () {
        var title = $('#example thead th').eq( $(this).index() ).text();
        $(this).html( '<input type="text" placeholder="Search '+title+'" />' );
    } );
 
    // DataTable
    var table = $('#example').DataTable();
 
    // Apply the search
    table.columns().eq( 0 ).each( function ( colIdx ) {
        $( 'input', table.column( colIdx ).footer() ).on( 'keyup change', function () {
            table
                .column( colIdx )
                .search( this.value )
                .draw();
        } );
    } );
} );
    
    
    </script>
        
       
        <script>
        
$(document).ready(function () {
    $("td", this).on("click", function () {
        var tds = $(this).parents("tr").find("td");
        $.each(tds, function (i, v) {
            $($(".data-form input")[i]).val($(v).text());
        });
    });
});
</script>
        
    <script>
        
 function validateForm() {
    var numbers = /^[0-9]+$/;  
    var x = document.forms["myForm"]["studentId"].value;
    if (x.match(numbers)) {
        alert('Your Registration number has accepted....');
       document.form1.text1.focus();  

        return true;
    }
     else  
      {  
      alert('Please input numeric characters only');  
      document.form1.text1.focus();  
      return false;  
      }
}
//validate form starts here
        
function validateForm()
{   
    if(document.frm.studentId.value=="" )
    {
      alert("studentId should not be blank");
      document.frm.studentId.focus();
      return false;
    }
    
     if(document.frm.firstname.value=="")
    {
      alert("firstname should not be blank");
      document.frm.firstname.focus();
      return false;
    }
     if(document.frm.lastname.value=="")
    {
      alert("lastname should not be blank");
      document.frm.lastname.focus();
      return false;
    }
    else if(document.frm.yearLevel.value=="" || document.frm.yearLevel.value=="0")
    {
      alert("yearLevel should not be blank");
      document.frm.yearLevel.focus();
      return false;
    }
}
    </script>
    
    
    <body>
        <div id="page-wrap" >
        <center>
        <h1>Student Information</h1>
        <br>
        <br>
                             
      
        <div class="CSSTableGenerator" >
        <table id="example"  class="data-table"  border="1">
            
            <thead>
            
            <tr>
            <td>Student ID</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Year Level</td>
            </tr>
            
            </thead>
            
            <tfoot>
            <tr>
                <th>Student ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Year Level</th>
            </tr>
            </tfoot>
            
            <tbody>
            
            <c:forEach items="${allStudents}" var="stud">
                <tr>
                    <td>${stud.studentId}</td>
                    <td>${stud.firstname}</td>
                    <td>${stud.lastname}</td>
                    <td>${stud.yearLevel}</td>
                </tr>
            </c:forEach>
                
            </tbody>
               
                </table>
            
                   
                    <hr>
                    </div>
       </div>
                    <div id='sidebar'>
                        <div id='cssmenu'>
                            <ul>
                   <li class='active'><a href='#'><span>Update Records</span></a></li>
                            
                <form name="frm"   class="data-form"  action="./StudentServlet" method="POST" onSubmit="return validateForm()">
              
                   <strong>Student ID --></strong><input type="text" name="studentId" value="${student.studentId}" /> 
                   <strong>First Name --></strong><input type="text" name="firstname" value="${student.firstname}" /> 
                    <strong>Last Name --></strong> <input type="text" name="lastname" value="${student.lastname}" /> 
                   <strong>Year Level --></strong><input type="text" name="yearLevel" value="${student.yearLevel}" /> 
            
               
        
                       
            
                    <input type="submit" name="action" value="Add"  />
                   <input type="submit" name="action" value="Edit" />
                    <input type="submit" name="action" value="Delete" />
                     <input type="submit" name="action" value=Refresh  />
                    
                         </form>
                
                   
                       </ul>
                   </div>
                   </div>

         
         </center> 
    </body>
</html>
