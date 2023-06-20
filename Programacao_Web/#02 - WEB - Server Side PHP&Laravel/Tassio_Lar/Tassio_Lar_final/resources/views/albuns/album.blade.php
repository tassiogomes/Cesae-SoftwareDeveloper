@extends('layouts.layout')

@section('content')
    <h1> Ver Albuns de (placeholder)</h1>
    <br>
    <div>
        <h4>Todos os albuns da banda</h4>
            <br>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nome do Álbum</th>
                        <th>Imagem</th>
                        <th>Data de Lançamento</th>
                    </tr>
                </thead>
                <tbody>
                    @foreach ($albuns as $album)
                        <tr>
                            <td>{{ $album->nome }}</td>
                            <td><img src="{{ asset('storage/' . $album->imagem) }}" alt="Capa do álbum {{ $album->nome }}" width="100px"></td>
                            <td>{{ $album->data_lancamento }}</td>
                        </tr>
                    @endforeach
                </tbody>
            </table>
    </div>
@endsection
