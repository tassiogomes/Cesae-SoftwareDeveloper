<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PrincipalController;
use App\Http\Controllers\SobreNosController;
use App\Http\Controllers\ContatoController;
use App\Http\Controllers\TesteController;
use App\Http\Controllers\FornecedorController;


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
)->name('site.index');

Route::get('/sobrenos', 
[SobreNosController::class, 'sobreNos']
)->name('site.sobrenos');

Route::get('/contato', 
[ContatoController::class, 'contato']
)->name('site.contato');

Route::get('/login', function(){
    return 'return function callback login';
})->name('site.login');


/******** ROTAS AGRUPADAS **********/

Route::prefix('/app')->group(function(){ /* a função prefix tem que receber um prefixo pra agrupar, nesse caso '/app', após isso foi chamado o método group que recebe uma função de callback */
    Route::get('/clientes', function(){
        return 'return function callback clientes';
    })->name('app.clientes');
    
    Route::get('/fornecedores', 
    [FornecedorController::class, 'index']
    )->name('app.fornecedores');
    
    Route::get('/produtos', function(){
        return 'return function callback produtos';
    })->name('app.produtos');
});



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

Route::get('/teste/{p1}/{p2}',
[TesteController::class, 'teste']
)->name('teste');

/******* REDIRECIONAMENTO DE ROTAS **********/

Route::get('/rota1', function(){
    return 'return function callback rota1';
})->name('site.rota1');

Route::get('/rota2', function(){
    return redirect()->route('site.rota1');
})->name('site.rota2');

/********** ROTA  DE CONTINGÊNCIA  *********/

Route::fallback(function(){
    return "return da rota fallback (rota que não existe) <a href='".route('site.index')."'> clique aqui </a>";
});




/* verbos HTTP

GET: É usado para recuperar informações do servidor. Geralmente, é usado para ler dados de um recurso específico.

POST: É usado para enviar dados para o servidor para criar um novo recurso. Geralmente, é usado para enviar dados de um formulário HTML ou enviar informações para serem processadas.

PUT: É usado para enviar dados para o servidor para atualizar completamente um recurso existente. Ou seja, ele substitui completamente o recurso existente pelos dados fornecidos.

PATCH: É usado para enviar dados para o servidor para atualizar parcialmente um recurso existente. Ou seja, ele atualiza apenas as partes específicas do recurso com base nos dados fornecidos.

DELETE: É usado para solicitar a exclusão de um recurso específico do servidor.

OPTIONS: É usado para obter as opções de comunicação disponíveis para um determinado recurso ou servidor. É frequentemente usado para verificar quais métodos (verbos) são permitidos em um recurso específico.

*/  
