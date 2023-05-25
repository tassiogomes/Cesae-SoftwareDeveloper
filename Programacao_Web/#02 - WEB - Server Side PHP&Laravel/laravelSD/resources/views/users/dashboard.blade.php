@extends('layouts.main')
@section('title')
<title>Dashboard</title>
@endsection

@section('content')
    <h1>Olá, {{ Auth::user()->name }}</h1>
    @if(Auth::user()->user_type == 1)
    <h1>Eu sou adm</h1>
    @endif
@endsection

@section('endcontent')
    <a href="{{route('home')}}"><li>Voltar</li></a>
@endsection

</body>
    <link rel="stylesheet" href="{}">
</html>