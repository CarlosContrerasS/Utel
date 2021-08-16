import React, {Fragment} from 'react';


const ProductCard = (props) => {
   const { producto } = props;
  return (
    <Fragment>
      <div className="product">
        <section className="product-colum1">
          <div className="product-elemento">
            <span>{producto.titulo}</span>
          </div>
          <div className="product-elemento">
            <span>{producto.precio}</span>
          </div>
        </section>
        <section className="product-colum2">
          <div className="product-elemento">
            <span>{producto.condicion}</span>
          </div>
          <br />
          <div className="product-elemento">
            <span>{producto.cantidadDisponible}</span>
          </div>
        </section>
        <section className="product-colum3">
          <div className="product-elemento">
            <div className="img-product">
              <img
                src={producto.miniatura}
                alt="imagen"
                className="img-miniatur"
              ></img>
            </div>
          </div>
        </section>
      </div>
    </Fragment>
  );
};
export default ProductCard;