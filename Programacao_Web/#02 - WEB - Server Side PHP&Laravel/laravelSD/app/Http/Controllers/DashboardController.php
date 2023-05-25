<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class DashboardController extends Controller
{
    public function dashboard()
    {
        return view('users.dashboard');
    }

    // Adicione outros métodos conforme necessário para trabalhar com outras views do backoffice
}

