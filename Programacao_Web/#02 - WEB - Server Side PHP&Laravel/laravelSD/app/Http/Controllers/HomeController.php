<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    //função pública
    public function index()
    {
        $myVar = 'Sou uma variável a ser enviada para a Blade';

        $contactInfo = [
            'name' => 'Nome da Pessoa',
            'phone' => 'Contacto da Pessoa'
        ];;

        //retornar a view com dados
        return view('contacts.home_contacts', compact('myVar', 'contactInfo'));
    }

    //função pública
    public function allContacts()
    {
        //chamar a função do nosso Controller
        $contacts = $this->getContacts();

        //retornar a view com os dados dos contactos
        return view('contacts.all_contacts', compact('contacts'));
    }


    //função que só se acede neste Controller
    protected function getContacts()
    {
        $contacts = [
            ['id' => 1, 'name' => 'Sara', 'phone' => '985654455'],
            ['id' => 2, 'name' => 'Bruno', 'phone' => '985654455'],
            ['id' => 3, 'name' => 'Márcia', 'phone' => '985654455']
        ];

        return $contacts;
    }

    protected function getCesaeInfo()
    {
        $cesaeInfo = [
            'name' => 'Cesae',
            'morada' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt'
        ];
        return $cesaeInfo;
    }
}
