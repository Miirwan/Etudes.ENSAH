<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib prefix="s" uri="/struts-tags"%>




<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>



<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gestion de Bibliotheque</title>
<sj:head jquerytheme="redmond" />

</head>
<body>
	<div >
      <div >AJOUT  D'UN LIVRE</div>
	  
	  
	  <div>

		<div class="contact_tab" >
				<s:form action="addBook" method="POST">
					<s:textfield label="isbn" name="book.isbn" required="true" />
					<s:textfield label="titre " name="book.title" required="true" />
					<s:textfield label="Prix" name="book.price" />
					<s:textfield label="Description" name="book.description" />
					<s:textfield label="Nombre de pages " name="book.nbOfPage" />
					<s:textfield label="Email auteur " name="book.emailAuteur" />
					<sj:datepicker name="book.dateAchat" maxDate="-1d"
						displayFormat="dd/mm/y" label="Date Achat" />
					

					<s:submit value="Valider" cssClass="btn btn-primary" />

				</s:form>
		</div>
	</div>
    <!-- end of column four -->
  </div>
</body>
</html>