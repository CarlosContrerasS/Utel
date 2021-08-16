import { React, useState } from 'react';

import './App.css';
import Encabezado from './components/Encabezado';
import SearchBar from './components/SearchBar';
import ProductCard from './components/ProductCard';
import Catalogo from './components/Catalogo';
import FinalPage from './components/FinalPage';
import Grid from '@material-ui/core/Grid';
import axios from "axios";
import Swal from "sweetalert2";

function App() {
  const [listaProductos, setListaProductos] = useState([]);
  const [producto, setProducto] = useState([]);
  const [busqueda, setBusqueda] = useState('');
  const [status, setStatus] = useState(false);

  const URL = "http://localhost:8080/api/search/" + busqueda;

  const llamado = async (e) => {
     e.preventDefault();
    
    await axios.get(URL)
      .then((response) => {
        setListaProductos(response.data);
        setProducto(response.data[0]);
        setStatus(true);
        Swal.fire("¡Hemos encontrado lo que buscabas!");
      })
      .catch( error => {
        Swal.fire({
           icon: 'error',
           title: 'Lo Sentimos',
           text: 'No hemos encontrado tu lo que buscabas',
        });
       setStatus(false);
      });
  }
  

  return (
    <Grid container spacing={3}>
        <Grid item xs={12} className="encabezado">
        <Encabezado />
      </Grid>
      <Grid item xs={12} className="search-bar">
        <SearchBar setBusqueda={setBusqueda} llamado={llamado} />
      </Grid>

      {status ? (
        <Grid container spacing={3}>
          <Grid item xs={12} className="product-card">
            <ProductCard producto={producto} />
          </Grid>
          <Grid item xs={12} className="catalogo">
            <Catalogo listaProductos={listaProductos} />
          </Grid>
        </Grid>
      ) : (
        <div></div>
      )}

      <Grid item xs={12} className="footer">
        <FinalPage />
      </Grid>
    </Grid>
  );
}

export default App;
