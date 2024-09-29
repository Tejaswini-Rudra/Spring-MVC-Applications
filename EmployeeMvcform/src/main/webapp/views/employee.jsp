<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<h1 style="color:blue">Employee invoice Application</h1>
<form:form action="/employee" method="POST" modelAttribute="employee">
Employee no:<form:input path="empno"/><p></p>
Employee Name:<form:input path="name"/><p></p>
salary:<form:input path="salary"/><p></p>
<input type="submit" value="printinvoice"/>
</form:form>
</center>