import React, { Fragment } from "react";
import DataTable, { createTheme } from "react-data-table-component";
import "../App.css";

const Styles = {
  rows: {
    style: {
      minHeight: "80px",
      fontSize: "17px",
      margin: " 0px auto",
    },
  },
  headCells: {
    style: {
      paddingLeft: "5px",
      paddingRight: "5px",
      fontSize: "17px",
      color: "white",
      background: "#634a78ce",
      "font-weight": "bold",
      margin: "0px auto",
      "text-align": "center",
    },
  },
  cells: {
    style: {
      paddingLeft: "15px",
      bold: "bold",
      "text-align": "center",
    },
  },
};
createTheme("tabla", {
  text: {
    color: "black",
  },
  background: {
    color: "white",
  },
  divider: {
    default: "#634a78ce",
  },
});


const Catalogo = (props) =>{

  const {listaProductos} = props;

  const paginacionOpciones = {
    rowsPerPageText: "Filas por Página",
    rangeSeparatorText: "de",
    selectAllRowsItem: true,
    selectAllRowsItemText: "Todos",
    rowsPerPageOptionsValueSelect: 30,
  };

  //Data columnas de la tabla
 
  const columnas = [
    {
      name: "Título",
      selector: "titulo",
      sortable: true,
      width: "50%",
    },
    {
      name: "Precio",
      selector: "precio",
      sortable: true,
      width: "18%",
    },
    {
      name: "Cantidad",
      selector: "cantidadDisponible",
      sortable: true,
      width: "12%",
    },
    {
      name: "Condición",
      selector: "condicion",
      sortable: true,
      width: "10%",
    },
    {
      name: "Imagen",
      selector: "miniatura",
      cell: (row) => (
        <div className="img-tabla">
          <img src={row.miniatura} alt="imagen" className="img"></img>
        </div>
      ),
      button: true,
      width: "10%",
    },
  ];

  return (
    <Fragment >
      <h1>Catálogo</h1>
      <div className="tabla">
        <DataTable
          columns={columnas}
          data={listaProductos}
          theme="tabla"
          customStyles={Styles}
          highlightOnHover
          pagination
          fixedHeader
          fixedHeaderScrollHeight="800px"
          paginationComponentOptions={paginacionOpciones}
          persistTableHead
          noDataComponent={<span>No se encontró ningún elemento</span>}
        />
      </div>
    </Fragment>
  );
}
export default Catalogo;