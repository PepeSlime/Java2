<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastro de Gêneros</title>
</head>
<body>
    <h2>Lista de Gêneros</h2>
    <form action="generos" method="post">
        Nome: <input type="text" name="nome" required />
        <button type="submit">Adicionar</button>
    </form>

    <ul>
        <%@ page import="java.util.List, application.model.Genero" %>
        <% List<Genero> generos = (List<Genero>) request.getAttribute("generos"); %>
        <% if (generos != null) { %>
            <% for (Genero genero : generos) { %>
                <li>
                    <%= genero.getNome() %>
                    <form action="deletarGenero" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="<%= genero.getId() %>">
                        <button type="submit">Excluir</button>
                    </form>
                </li>
            <% } %>
        <% } %>
    </ul>
</body>
</html>
