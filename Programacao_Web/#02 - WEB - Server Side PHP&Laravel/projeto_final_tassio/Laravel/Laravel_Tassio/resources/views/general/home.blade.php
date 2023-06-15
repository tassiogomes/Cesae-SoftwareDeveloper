@extends('layouts.layout')

@section('content')
    <h1>Home</h1>
    <h3>Bem-vindo à Home page das Bandas do Johnny! 😎</h3>
    <br>
    <div>
        <h4>Todas as bandas 🎸</h4>
        <p>Aqui uma tabela com o nome de uma banda, uma foto da mesma e o número de álbuns criados.</p>
        <br>
        <table class="table">
            <thead>
                <tr>
                    <th>Nome da Banda</th>
                    <th>Foto</th>
                    <th>Número de Álbuns</th>
                    <th>Ver albuns</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($bandas as $banda)
                    <tr>
                        <td>{{ $banda->nome }}</td>
                        <td><img src="{{ asset('storage/' . $banda->foto) }}" alt="Uma foto da banda {{ $banda->nome }}"
                                width="100px"></td>
                        <td>{{ $banda->numero_albuns }}</td>
                        <td>
                            <a href="{{ route('albuns.album', ['id' => $banda->id]) }}" class="btn btn-primary">Ver Álbuns</a>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
@endsection
