<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PrincipalController;
use App\Http\Controllers\SobreNosController;
use App\Http\Controllers\ContatoController;


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


/* OS CONTROLLERS RETORNAM VIEWS E AS AS ROTAS RETORNAM OS CONTROLLERS E OS MÉTODOS (ACTIONS) */

Route::get('/', 
[PrincipalController::class, 'principal']
)->name('principal');

Route::get('/sobrenos', 
[SobreNosController::class, 'sobreNos']
)->name('sobrenos');;

Route::get('/contato', 
[ContatoController::class, 'Contato']
)->name('contato');;


/******* ROTAS PARA TESTES *********/

/**criada uma variavel nome que será repetida no texto da linha abaixo após a mensagem 
('/contato/{nome}/{sobrenome?}' a interrogação diz que o sobrenome não é necessário, e passa '' como parametro padrao, se nao fizesse isso
a rota /nome daria erro porque sempre precisaria do /sobrenome
*/
Route::get('/contato/{nome}/{sobrenome?}', 
    function(
        string $nome, 
        string $sobrenome = '') { 
    echo "Estamos aqui na rota de teste contato:  $nome -  $sobrenome";}
);

















/* verbos HTTP

GET: É usado para recuperar informações do servidor. Geralmente, é usado para ler dados de um recurso específico.

POST: É usado para enviar dados para o servidor para criar um novo recurso. Geralmente, é usado para enviar dados de um formulário HTML ou enviar informações para serem processadas.

PUT: É usado para enviar dados para o servidor para atualizar completamente um recurso existente. Ou seja, ele substitui completamente o recurso existente pelos dados fornecidos.

PATCH: É usado para enviar dados para o servidor para atualizar parcialmente um recurso existente. Ou seja, ele atualiza apenas as partes específicas do recurso com base nos dados fornecidos.

DELETE: É usado para solicitar a exclusão de um recurso específico do servidor.

OPTIONS: É usado para obter as opções de comunicação disponíveis para um determinado recurso ou servidor. É frequentemente usado para verificar quais métodos (verbos) são permitidos em um recurso específico.

*/  
