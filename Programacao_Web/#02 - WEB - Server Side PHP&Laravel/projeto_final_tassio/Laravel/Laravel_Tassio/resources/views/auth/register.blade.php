@extends('layouts.layout')

@section('title')
    <title>Adicionar Users</title>
@endsection

@section('content')

    <div class="container">

        @if (session('message'))
        <div class="alert alert-success">{{ session('message') }}</div>
    @endif

          <h1>Registar novo User</h1>
        <form method="POST" action="{{ route('create_user') }}">
            @csrf
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email address</label>
                <input type="email" class="form-control" name="email" value="" id="exampleInputEmail1"
                    aria-describedby="emailHelp">

                @error('email')
                    <div id="emailHelp" class="form-text">Insira um email válido.</div>
                @enderror

            </div>
            <div class="mb-3">
                <label for="exampleInputName1" class="form-label">Nome
                </label>
                <input name="name" type="text" value="" class="form-control" id="exampleInputName1"
                    aria-describedby="nameHelp">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input name="password" value="" type="password" class="form-control" id="exampleInputPassword1">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
@endsection
