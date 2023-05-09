const express = require('express');
const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
  res.send('Flechuda');
});

app.get('/products', (req, res) => {
  const products = [
    {
      id: 1,
      name: 'hammer',
    },
    {
      id: 2,
      name: 'screwdriver',
    },
    {
      id: 3,
      name: 'wrench',
    },
  ];
  res.send(JSON.stringify(products));
});

app.listen(PORT, () => {
  console.log(`Example app listening on port ${PORT}!`);
});
