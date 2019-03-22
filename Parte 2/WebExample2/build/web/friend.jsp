<%@page import="model.Category"%>
<%@page import="java.util.Collection"%>
<%@page import="model.Friend"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="html/menu.html"/>

<!-- List All -->
<c:if test="${friends != null}">
    <form action="friendController" method="POST">
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">Friend ID</th>
                    <th scope="col">Friend Name</th>
                    <th scope="col">Friend Phone</th>
                    <th scope="col">Friend Age</th>
                    <th scope="col">Friend Category</th>

                    <c:if test="${param.actionFriend == 'Modify Friends'}">
                        <th scope="col">Modify Friend</th>
                        </c:if>
                    <c:if test="${param.actionFriend == 'Delete Friends'}">
                        <th scope="col">Delete Friend</th>
                    </c:if>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${friends}" var="friend">
                    <tr>
                        <th scope="row">${friend.friendID}</th>
                        <td>${friend.name}</td>
                        <td>${friend.phone}</td>
                        <td>${friend.age}</td>
                        <td>${friend.categoryId}</td>
                        <c:if test="${param.actionFriend == 'Delete Friends'}">
                            <td scope="col">
                                <button class="btn btn-danger" type="submit" value="${friend.friendID};${friend.name}" name="friend">Delete</button>
                                <input type="hidden" name="actionFriend" value="deleteFriend"/>
                            </td>                                        
                        </c:if>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </form>
</c:if>

<c:if test="${select_categories != null}">
    <form action="friendController" method="POST">
        <div class="form-group">
            <label for="inputFriend">Friend Name:</label>
            <input type="text" class="form-control" id="friendName" name="friendName" placeholder="Friend Name">
        </div>



        <div class="form-group">
            <label for="inputFriend">Friend Phone: </label>
            <input type="text" class="form-control" id="friendPhone" name="friendPhone" placeholder="Friend Phone">
        </div>



        <div class="form-group">
            <label for="inputFriend">Friend Age: </label>
            <input type="number" class="form-control" id="friendAge" name="friendAge" placeholder="Friend Age">
        </div>



        <div class="form-group">
            <label for="inputFriend">Friend Category:</label>
            <select id = "friendCategory" name="friendCategory">
                <%
                    Collection<Category> select_categories = (Collection<Category>) request.getAttribute("select_categories");
                    for (Category category : select_categories) {
                        out.println("<option value=" + category.getId() + " >" + category.getDescription() + "</option>");
                    }
                %>
            </select>
        </div>



        <button type="submit" class="btn btn-primary" value="Add Friend" name="actionFriend">Add Friend</button>
    </form>
</c:if>

<%
    if (request.getAttribute("success") != null) {
        out.println("<div class='alert alert-success' role='alert'>" + request.getAttribute("success") + "</div>");
    }

//Error message -->
    if (request.getAttribute("error") != null) {
        out.println("<div class='alert alert-success' role='alert'>" + request.getAttribute("error") + "</div>");
    }
%>

<jsp:include page="html/footer.html"/>