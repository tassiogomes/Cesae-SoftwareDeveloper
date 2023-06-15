@extends('layouts.layout')

@section('title')
    <title>Login</title>
@endsection

@section('content')
    <div class="container">

        <h1>Login</h1>
        <form method="POST" action="{{ route('login') }}">
            @csrf

            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email address</label>
                <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                @error('email')
                    <div class="text-danger">Email Incorreto ❌. Tenta Novamente</div>
                @enderror
            </div>


            @error('email')
                Password Equivocada ❌
            @enderror
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input name="password" type="password" class="form-control" id="exampleInputPassword1">
            </div>


            @error('password')
                Password Equivocada ❌
            @enderror
            <button type="submit" class="btn btn-primary">Entrar</button>
        </form>
    </div>
@endsection
