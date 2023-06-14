<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class PrincipalController extends Controller
{
    /* Actions são os métodos dentro dos controladores, que dão ações as rotas */
    public function principal(){
        return view('site.principal');
    }
}
