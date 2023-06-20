@php
    use App\Models\User;
@endphp
@extends('layouts.layout')

@section('content')
@if(Auth::user()->user_type == User::admin)
    <div class="text-center">
        <a href="{{ route('post-adicionar-banda') }}" class="btn btn-primary">Adicionar Banda</a>
        <a href="{{ route('post-adicionar-Album') }}" class="btn btn-primary">Adicionar Album</a>
    </div>
@endif
    <div>
        <br>
        <h4>Todas as bandas</h4>

        <table class="table">
            <thead>
                <tr>
                    <th>Nome da Banda</th>
                    <th>Foto</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($bandas as $banda)
                    <tr>
                        <td>{{ $banda->nome }}</td>
                        <td><img src="{{ asset('storage/' . $banda->foto) }}" alt="Uma foto da banda {{ $banda->nome }}"
                                width="100px"></td>
                        <td>
                            <a href="{{ route('editar-banda', ['id' => $banda->id]) }}"
                                class="btn btn-primary">Editar</a>
                                @if(Auth::user()->user_type == User::admin)
                            <a href="{{ route('apagar-banda', ['id' => $banda->id]) }}"
                                class="btn btn-danger">Apagar</a>
                                @endif
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>

        <h4>Todos os álbuns</h4>

        <table class="table">
            <thead>
                <tr>
                    <th>Nome do álbum</th>
                    <th>Foto</th>
                    <th>Data de lançamento</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($albuns as $album)
                    <tr>
                        <td>{{ $album->nome }}</td>
                        <td><img src="{{ asset('storage/' . $album->imagem) }}" alt="Uma foto do álbum {{ $album->nome }}"
                                width="100px"></td>
                        <td>{{ $album->data_lancamento }}</td>
                        <td>
                            <a href="{{ route('editar-album', ['id' => $album->id]) }}"
                                class="btn btn-primary">Editar</a>
                                @if(Auth::user()->user_type == User::admin)
                            <a href="{{ route('apagar-album', ['id' => $album->id]) }}"
                                class="btn btn-danger">Apagar</a>
                                @endif
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
@endsection
