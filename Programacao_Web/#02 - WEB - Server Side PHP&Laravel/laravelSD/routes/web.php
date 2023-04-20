<?php

use App\Http\Controllers\HomeController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;


/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});
Route::get('/hello_world', function () {
    return "<h1>Hello World</h1>";
});
Route::get('/hello/{id}', function ($id) {
    return "</h1>Hello<h1>" . $id;
});
Route::get('/laravel_blade', function () {
    return view('laravel_blade');
});

Route::get('/simple_php', function () {
    return view('simple_php');
});
Route::get('/hello_world/software_dev', function () {
    return "</>Hello Developer<h1>";
});
Route::get('/portfolio', function () {
    return "</h1>Sou o Portfólio<h1>";
});
Route::get('/contacts', function () {
    return "</h1>Sou os Contactos<h1>";
})->name('contacts.show');
Route::get('/home', function () {
    $html = "
   <h1>I am at Home</h1>
   <div>
        <a href='/portfolio'>Portfolio</a>
        <a href=" . route('contacts.show') . ">Contactos</a>
   <div>
   ";
    return $html;
});
Route::fallback(function () {
    return view('fallback');
});

Route::get('/home_contacts', [HomeController::class, 'index'])->name('index.contacts');
Route::get('/all_contacts', [HomeController::class, 'allContacts'])->name('contacts.all');


/* Software Developer */

Route::get(
    '/home',
    [UserController::class, 'index']
)->name('home');

Route::get(
    '/home_all_users',
    [UserController::class, 'all_users']
)->name('show_all_users');

Route::get('/home_add_user',   [UserController::class, 'add_user'])->name('add_user');
