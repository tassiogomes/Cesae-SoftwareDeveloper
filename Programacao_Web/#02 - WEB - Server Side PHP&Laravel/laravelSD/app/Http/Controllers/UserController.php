<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function index()
    {
        $aMinhaVariavel = "Hello turma de Soft Dev!";

        return view('users.home', compact('aMinhaVariavel'));
    }

    public function all_users()
    {
        $oMeuArray = [
            'nome' => 'Sara',
            'nome2' => 'José',
            'nome3' => 'Rúben',
        ];
        
        $cesaeInfo = $this->getCesaeInfo();

        return view('users.all_users', compact('oMeuArray', 'cesaeInfo'));
    }

    public function add_user()
    {
        return view('users.all_users');
    }

    protected function getCesaeInfo()
    {
        $cesaeInfo = [
            'name' => 'Cesae',
            'address' => 'Rua Cenas',
            'email' => 'cenas@gmail.com',
        ];

        return $cesaeInfo;
    }
}
