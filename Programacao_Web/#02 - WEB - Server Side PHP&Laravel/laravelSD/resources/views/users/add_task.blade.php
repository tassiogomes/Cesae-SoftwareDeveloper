@extends('layouts.main')

@section('title')
    <title>Adicionar Users</title>
@endsection

@section('content')
    <h1>Adicionar User</h1>

    <div class="container">
        <form method="POST" action="{{ route('create_task') }}">
            @csrf

            <form method="GET">
            <select class="custom-select" name="user_id">
                <option value="" selected>Todos os Contactos</option>
                @foreach ($allUsers as $item)
                    <option @if ($item->id == request()->query('user_id')) selected @endif value="{{ $item->id }}">
                        {{ $item->name }}
                    </option>
                @endforeach
            </select>
        </form>


            <div class="mb-3">
                <label for="exampleInputName1" class="form-label">Inserir task</label>
                <input name="task" type="text" value="" class="form-control" id="exampleInputName1" aria-describedby="nameHelp">
            </div>


            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>

    <a href="{{ route('home') }}">Voltar</a>
@endsection
