<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function index()
    {
        return view('users.home');
    }

    public function all_users()
    {
        return view('users.all_users');
    }

    public function add_user()
    {
        return view('users.new_user');
    }
}

