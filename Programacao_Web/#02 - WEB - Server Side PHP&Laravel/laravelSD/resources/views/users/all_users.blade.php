@extends('layouts.main')

@section('title')
    <title>All Users</title>
@endsection

@section('content')
    <div class="container bg-danger">
        <h1>Olá, sou a lista de utilizadores</h1>
    </div>


    <h4>teste de Array</h4>
    {{--<h5>{{ $oMeuArray['nome3'] }}</h5>--}}

    <h2>
        Info Cesae
    </h2>
    <h5>{{ $cesaeInfo['address'] }}</h5>
@endsection

@section('endcontent')
    fim do conteúdo de teste
@endsection
