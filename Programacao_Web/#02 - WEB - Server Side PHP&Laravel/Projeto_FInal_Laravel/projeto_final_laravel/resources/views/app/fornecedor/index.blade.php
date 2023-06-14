<h1>Blade fornecedor retornada pelo FornecedorController</h1>
@php
/* a blade não aceita imprimir array diretor {{ $fornecedor }}
para imprimir array é @dd
@dd($fornecedores)*/
@endphp



@if(count($fornecedores) >=0  && count($fornecedores) < 10)
    <h3>Há fornecedores cadastrados</h3>
@elseif(count($fornecedores) >10)
    <h3>Há muitos fornecedores cadastrados</h3>
@else
    <h3>Não há fornecedores cadastrados</h3>
@endif