package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Information</title>\n");
      out.write("        \n");
      out.write("         <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"jquery.dataTables.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css\" />\n");
      out.write("    \n");
      out.write("    <script src=\"http://code.jquery.com/ui/1.10.0/jquery-ui.js\" type=\"text/javascript\"></script>\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/demos/style.css\" />\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    <style>\n");
      out.write("    tfoot input {\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 3px;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    \n");
      out.write("    $(document).ready(function() {\n");
      out.write("    // Setup - add a text input to each footer cell\n");
      out.write("    $('#example tfoot th').each( function () {\n");
      out.write("        var title = $('#example thead th').eq( $(this).index() ).text();\n");
      out.write("        $(this).html( '<input type=\"text\" placeholder=\"Search '+title+'\" />' );\n");
      out.write("    } );\n");
      out.write(" \n");
      out.write("    // DataTable\n");
      out.write("    var table = $('#example').DataTable();\n");
      out.write(" \n");
      out.write("    // Apply the search\n");
      out.write("    table.columns().eq( 0 ).each( function ( colIdx ) {\n");
      out.write("        $( 'input', table.column( colIdx ).footer() ).on( 'keyup change', function () {\n");
      out.write("            table\n");
      out.write("                .column( colIdx )\n");
      out.write("                .search( this.value )\n");
      out.write("                .draw();\n");
      out.write("        } );\n");
      out.write("    } );\n");
      out.write("} );\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("        \n");
      out.write("$(document).ready(function () {\n");
      out.write("    $(\"td\", this).on(\"click\", function () {\n");
      out.write("        var tds = $(this).parents(\"tr\").find(\"td\");\n");
      out.write("        $.each(tds, function (i, v) {\n");
      out.write("            $($(\".data-form input\")[i]).val($(v).text());\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write(" function validateForm() {\n");
      out.write("    var numbers = /^[0-9]+$/;  \n");
      out.write("    var x = document.forms[\"myForm\"][\"studentId\"].value;\n");
      out.write("    if (x.match(numbers)) {\n");
      out.write("        alert('Your Registration number has accepted....');\n");
      out.write("       document.form1.text1.focus();  \n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("     else  \n");
      out.write("      {  \n");
      out.write("      alert('Please input numeric characters only');  \n");
      out.write("      document.form1.text1.focus();  \n");
      out.write("      return false;  \n");
      out.write("      }\n");
      out.write("}\n");
      out.write("//validate form starts here\n");
      out.write("        \n");
      out.write("function validateForm()\n");
      out.write("{   \n");
      out.write("    if(document.frm.studentId.value==\"\" )\n");
      out.write("    {\n");
      out.write("      alert(\"studentId should not be blank\");\n");
      out.write("      document.frm.studentId.focus();\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("     if(document.frm.firstname.value==\"\")\n");
      out.write("    {\n");
      out.write("      alert(\"firstname should not be blank\");\n");
      out.write("      document.frm.firstname.focus();\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("     if(document.frm.lastname.value==\"\")\n");
      out.write("    {\n");
      out.write("      alert(\"lastname should not be blank\");\n");
      out.write("      document.frm.lastname.focus();\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    else if(document.frm.yearLevel.value==\"\" || document.frm.yearLevel.value==\"0\")\n");
      out.write("    {\n");
      out.write("      alert(\"yearLevel should not be blank\");\n");
      out.write("      document.frm.yearLevel.focus();\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>Student Information</h1>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("                             \n");
      out.write("      \n");
      out.write("            \n");
      out.write("        <table id=\"example\"  class=\"data-table\"  border=\"1\">\n");
      out.write("            \n");
      out.write("            <thead>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("            <th>Student ID</th>\n");
      out.write("            <th>First Name</th>\n");
      out.write("            <th>Last Name</th>\n");
      out.write("            <th>Year Level</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            <tfoot>\n");
      out.write("            <tr>\n");
      out.write("                <th>Student ID</th>\n");
      out.write("                <th>First Name</th>\n");
      out.write("                <th>Last Name</th>\n");
      out.write("                <th>Year Level</th>\n");
      out.write("            </tr>\n");
      out.write("            </tfoot>\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("               \n");
      out.write("                </table>\n");
      out.write("            \n");
      out.write("                   \n");
      out.write("                    <hr>\n");
      out.write("                <form name=\"frm\"   class=\"data-form\"  action=\"./StudentServlet\" method=\"POST\" onSubmit=\"return validateForm()\">\n");
      out.write("              \n");
      out.write("                   <strong>Student ID --></strong><input type=\"text\" name=\"studentId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.studentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> \n");
      out.write("                   <strong>First Name --></strong><input type=\"text\" name=\"firstname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> \n");
      out.write("                    <strong>Last Name --></strong> <input type=\"text\" name=\"lastname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> \n");
      out.write("                   <strong>Year Level --></strong><input type=\"text\" name=\"yearLevel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.yearLevel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> \n");
      out.write("            \n");
      out.write("               \n");
      out.write("        \n");
      out.write("                       \n");
      out.write("            \n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Add\"  />\n");
      out.write("                   <input type=\"submit\" name=\"action\" value=\"Edit\" />\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Delete\" />\n");
      out.write("                     <input type=\"submit\" name=\"action\" value=Refresh  />\n");
      out.write("                    \n");
      out.write("                         </form>\n");
      out.write("\n");
      out.write("         \n");
      out.write("         </center> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allStudents}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("stud");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.studentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stud.yearLevel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
