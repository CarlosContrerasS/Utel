import { React , Fragment } from 'react';
import '../App.css';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import SearchIcon from '@material-ui/icons/Search';


const SearchBar = (props) =>{

  const { setBusqueda, llamado } = props;

  
   return (
    <Fragment >
      <h1>Busqueda de Productos</h1>
      <h2>Escriba un producto y presione buscar (Ejemplo: Iphone)</h2>

      <TextField
        id="outlined-search "
        label="Ingrese el Producto a Buscar"
        type="search"
        variant="outlined"
        style={{ margin: 2 }}
        className="input-busqueda"
        onChange={(e) => setBusqueda(e.target.value)}
      />

      <Button
        variant="contained"
        size="large"
        color="primary"
        style={{ margin: 8 }}
        onClick={(event) => llamado(event)}
      >
        <SearchIcon />
      </Button>
    </Fragment>
  );
}
export default SearchBar;