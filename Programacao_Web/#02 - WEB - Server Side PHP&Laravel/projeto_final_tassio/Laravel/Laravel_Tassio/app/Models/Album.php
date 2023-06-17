<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Album extends Model
{
    protected $table = 'albuns';

    protected $fillable = [
        'nome',
        'imagem',
        'data_lancamento',
        'banda_id',
        'numero_albuns',
    ];

    public function banda()
    {
        return $this->belongsTo(Banda::class, 'banda_id');
    }
}
