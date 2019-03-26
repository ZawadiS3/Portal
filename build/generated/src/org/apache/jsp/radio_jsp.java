package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class radio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
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
      out.write("<br/><br/>\n");
      out.write("<table class=\"resul_table\">\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <select class=\"cbo_account\">\n");
      out.write("                <option value=\"1\">  Account 1   </option>\n");
      out.write("                <option value=\"2\">  Account 2   </option>\n");
      out.write("                <option value=\"3\">  Account 3   </option>\n");
      out.write("                <option value=\"4\">  Account 4   </option>\n");
      out.write("                <option value=\"5\">  Account 5   </option>\n");
      out.write("                <option value=\"6\">  Account 6   </option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("            <input type=\"text\"/>\n");
      out.write("\n");
      out.write("        </td>\n");
      out.write("\n");
      out.write("        <td class=\"radios_td\">\n");
      out.write("            <input type=\"radio\" class=\"rdios radio_dr\" name=\"dr_cr\"data-type=\"debit\" id=\"radio_dr\" /> <label for=\"radio_dr\" > Debit</label><br/>\n");
      out.write("            <input type=\"radio\" class=\"rdios radio_cr\" name=\"dr_cr\"data-type=\"credit\" id=\"radio_cr\" /> <label for=\"radio_cr\" > Credit</label>\n");
      out.write("        </td>\n");
      out.write("        <td>Cell</td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    $('.rdios').change(function () {\n");
      out.write("        console.log('Changed:   ' + $(this).data('type'));\n");
      out.write("    });\n");
      out.write("    $('.cbo_account').change(function () {\n");
      out.write("\n");
      out.write("        var item = $(this, 'option:selected').val();\n");
      out.write("        var radio = $(this).closest('tr').find('.radios_td > .radio_dr').data('type');\n");
      out.write("        if (item == 1) {\n");
      out.write("            \n");
      out.write("        } else if (item == 2) {\n");
      out.write("            radio.attr('checked','checked');\n");
      out.write("            console.log('selected 2: ' + radio);\n");
      out.write("        } else if (item == 3) {\n");
      out.write("\n");
      out.write("        } else if (item == 4) {\n");
      out.write("            \n");
      out.write("        } else if (item == 5) {\n");
      out.write("\n");
      out.write("        } else if (item == 6) {\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    ");



    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
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
}
