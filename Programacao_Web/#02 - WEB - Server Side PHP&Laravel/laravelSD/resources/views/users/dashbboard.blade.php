@extends('layouts.main_layout')
@section('title')
<title>Dashboard</title>
@endsection

@section('content')
    <h1>Olá, {{ auth::user()->name }}</h1>
@endsection

@section('endcontent')
    <a href="{{route('home')}}"><li>Voltar</li></a>
@endsection

</body>
    <link rel="stylesheet" href="{}">
</html>