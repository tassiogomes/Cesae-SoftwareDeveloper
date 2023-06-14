<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class TesteController extends Controller
{
    public function teste($p1, $p2){
        echo "A soma de $p1 e $p2 é: ".($p1 + $p2);
        //return view('site.teste', ["x" => $p1, "y" => $p2]); // redirecionamento de parametros pra view, criou o íncice x do array que contém o valor p1
        return view('site.teste', compact('p1', 'p2')); // metodo compact, faz o mesmo que o array associativo aicma
    }
}
