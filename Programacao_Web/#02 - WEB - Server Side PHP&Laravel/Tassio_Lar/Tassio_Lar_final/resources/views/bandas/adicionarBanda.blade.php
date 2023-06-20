@php
    use App\Models\User;
@endphp

@extends('layouts.layout')
@section('content')
@auth
@if(Auth::user()->user_type == User::admin)
    <h1>Adicionar nova Banda</h1>

    <form action="{{ route('post-adicionar-banda') }}" method="POST" enctype="multipart/form-data">
        @csrf
        <div class="form-group">

            @if (session('message'))
                <div class="alert alert-success">{{ session('message') }}</div>
            @endif

            <label for="nome">Nome</label>
            <input type="text" name="nome" id="nome" class="form-control">
            @error('nome')
                <div class="error">{{ $message }}</div>
            @enderror
        </div>
        <br>
        <div class="form-group">
            <label for="foto">Foto</label>
            <input type="file" name="foto" id="foto" class="form-control-file">
            @error('foto')
                <div class="error">{{ $message }}</div>
            @enderror
        </div>
<br>
        <button type="submit" class="btn btn-primary">Adicionar</button>
        <br>
    </form>
    @else
    <h3>Não tem acesso a essa página</h3>
    @endif
    @endauth
    @endsection

