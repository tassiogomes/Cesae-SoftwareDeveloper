<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class DashboardController extends Controller
{
    public function index()
    {
        return view('dashboard.home');
    }

    // Adicione outros métodos conforme necessário para trabalhar com outras views do backoffice
}

