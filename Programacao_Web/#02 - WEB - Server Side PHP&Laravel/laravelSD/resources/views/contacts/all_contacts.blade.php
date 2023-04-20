@extends('layouts.main_layout')

@section('content')
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Contacto</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($contacts as $item)
                    <tr>
                        <td>{{ $item['id'] }}</td>
                        <td>{{ $item['name'] }}</td>
                        <td>{{ $item['phone'] }}</td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
@endsection
