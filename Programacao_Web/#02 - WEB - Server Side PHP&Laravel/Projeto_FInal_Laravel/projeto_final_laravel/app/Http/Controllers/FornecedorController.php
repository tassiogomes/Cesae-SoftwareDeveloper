<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class FornecedorController extends Controller
{
    public function index(){
        $fornecedores = ['Fornecedor 1']; //variável fornecedores que recebe o um array
        return view('app.fornecedor.index', compact('fornecedores')); //compact para usar essa variável dentro da blade
    }
}
