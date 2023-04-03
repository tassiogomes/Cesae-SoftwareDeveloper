<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link rel="stylesheet" href="{{asset('css/style.css')}}">
</head>
<body>
    <h1>Essa é a minha home</h1>

    <ul>
            <li> <a href="{{Route('show_all_users')}}">All users</a></li>
            <li> <a href="{{Route('new-user')}}">Add user</a></li>
    </ul>

</body>
</html>

