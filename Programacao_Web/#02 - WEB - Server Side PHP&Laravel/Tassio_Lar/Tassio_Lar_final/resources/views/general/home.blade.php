@extends('layouts.layout')

@section('content')
    <h1>Home</h1>
    <div>
        <br>
        <h4>Olá
        @auth
        {{ Auth::user()->name }}
        @endauth
    </h4>
    </div>
@endsection

