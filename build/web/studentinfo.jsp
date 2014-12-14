<%-- 
    Document   : index
    Created on : 20-Jan-2013, 22:16:54
    Author     : Joseph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="http://code.jquery.com/ui/1.10.0/jquery-ui.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/resources/demos/style.css" />
    </head>
    
   
    <style>
        body {
    font-size: 62.5%;
}
label, input {
    display: block;
}
input.text {
    margin-bottom: 12px;
    width: 95%;
    padding: .4em;
}
fieldset {
    padding: 0;
    border: 0;
    margin-top: 25px;
}
h1 {
    font-size: 1.2em;
    margin: .6em 0;
}
div#users-contain {
    width: 350px;
    margin: 20px 0;
}
div#users-contain table {
    margin: 1em 0;
    border-collapse: collapse;
    width: 100%;
}
div#users-contain table td, div#users-contain table th {
    border: 1px solid #eee;
    padding: .6em 10px;
    text-align: left;
}
.ui-dialog .ui-state-error {
    padding: .3em;
}
.validateTips {
    border: 1px solid transparent;
    padding: 0.3em;
}
#dialog-form {
    display: none;
}
}
 </style>
 <script>
    $(function () {

    var new_dialog = function (type, row) {
        var dlg = $("#dialog-form").clone();
        var Student-ID = dlg.find(("#Student-ID")),
            first-name = dlg.find(("#first-name")),
            last-name = dlg.find(("#last-name")),
            yearLevel = dlg.find(("#yearLevel"));
        type = type || 'Create';
        var config = {
            autoOpen: true,
            height: 300,
            width: 350,
            modal: true,
            buttons: {
                
                    "Cancel": function () {
                    dlg.dialog("close");
                }
            },
            close: function () {
                dlg.remove();
            }
        };
        if (type === 'Edit') {
            config.title = "Edit User";
            get_data();
            //delete(config.buttons['Create an account']);
            config.buttons['Edit account'] = function () {
                row.remove();
                

            };

        }
        dlg.dialog(config);

        function get_data() {
            var _Student-ID = $(row.children().get(1)).text(),
                _first-name = $(row.children().get(2)).text();
                _last-name = $(row.children().get(3)).text();
                _yearLevel = $(row.children().get(4)).text();
            Student-ID.val(_Student-ID);
            first-name.val(_first-name);
            last-name.val(_last-name);
            yearLevel.val(_yearLevel);
            
            
             }

        function save_data() {
            $("#users tbody").append("<tr>" + "<td>" + (fname.find("option:selected").text() + ' ').concat(lname.find("option:selected").text()) + "</td>" + "<td>" + email.val() + "</td>" + "<td>" + password.val() + "</td>" + "<td><a href='' class='edit'>Edit</a></td>" + "<td><span class='delete'><a href=''>Delete</a></span></td>" + "</tr>");
            dlg.dialog("close");
        }
    };

    $(document).on('click', 'span.delete', function () {
        $(this).closest('tr').find('td').fadeOut(1000,

        function () {
            // alert($(this).text());
            $(this).parents('tr:first').remove();
        });

        return false;
    });
    $(document).on('click', 'td a.edit', function () {
        new_dialog('Edit', $(this).parents('tr'));
        return false;
    });

    $("#create-user").button().click(new_dialog);

});
    
</script>
    <body>
        <center>
        <h1>Student Information</h1>
        <br>
        <br>
        <section class="container">
            
            <p> Enter your Search term HERE:  <input type="search" class="light-table-filter" data-table="order-table" placeholder="Filter and Search">  
            </p>
            
      
                <div class="CSSTableGenerator" >
            <div id="users-contain" class="ui-widget">
            	<h1>Existing Users:</h1>
        <table id="users" class="ui-widget ui-widget-content" border="1">
            <thead>
                <tr class="ui-widget-header ">
                    <th>Student ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Year Level</th>
                    <th>Actions</th>
                   </tr>
            </thead>
            
            <tbody>
                
            <c:forEach items="${allStudents}" var="stud">
                <tr class="nr">
                    <td>${stud.studentId}</td>
                    <td>${stud.firstname}</td>
                    <td>${stud.lastname}</td>
                    <td>${stud.yearLevel}</td>
                    <td><a class="edit" href="">Edit</a></td>
                  
                </tr>
            </c:forEach>
            </tbody>
            </table>
            </div>
                    <hr>
                    <div id="dialog-form" title="Create new user">
                     <p class="validateTips">All form fields are required.</p>
                <form name="frm" action="./StudentServlet" method="POST" onSubmit="return validateForm()">
                    <fieldset>
                    <label for="student-ID">Student ID</label><input type="text" id="Student-ID"  class="text ui-widget-content ui-corner-all"  name="Student-ID" value="" />
                    <label for="first-name">First Name</label><input type="text" id="first-name"  class="text ui-widget-content ui-corner-all"  name="first-name" value="" />
                    <label for="last-name">Last Name</label><input type="text" id="last-name"  class="text ui-widget-content ui-corner-all"  name="last-name" value="" />
                    <label for="yearLevel">year Level</label><input type="text" id="yearLevel"  class="text ui-widget-content ui-corner-all"  name="yearLevel" value="" />
                    </fieldset>
                </form>
                   </div>
               
                
         
      </div>
            
                </section>
         <br>
             <form name="frm" action="./StudentServlet" method="POST" >
                <tr>
                    <td><strong>Student ID --></strong><input type="text" name="studentId" value="${student.studentId}" /> </td>
                    <td><strong>First Name --></strong><input type="text" name="firstname" value="${student.firstname}" /> </td>
                    <td><strong>Last Name --></strong> <input type="text" name="lastname" value="${student.lastname}" /> </td>
                    <td><strong>Year Level --></strong><input type="text" name="yearLevel" value="${student.yearLevel}" /> </td>
                </tr>   
                
            <table>
              <tr>
                <td colspan="5">
                        <input type="submit" name="action" value="Add"  />
                        <input type="submit" name="action" value="Edit and Save" />
                        <input type="submit" name="action" value="Delete and Save" />
                        <input type="submit" name="action" value=Refresh  />
                    </td>    
                </tr>       
            </table>    
                         </form>

         
         </center> 
    </body>
</html>
