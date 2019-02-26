import React from "react";

export default function Navbar() {
  return (
    <nav className="navbar navbar-expand-lg " color-on-scroll="500">
      <div className=" container-fluid  ">
        <a className="navbar-brand" href="#pablo">
          {" "}
          Subscription Manager{" "}
        </a>
        <button
          href=""
          className="navbar-toggler navbar-toggler-right"
          type="button"
          data-toggle="collapse"
          aria-controls="navigation-index"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-bar burger-lines" />
          <span className="navbar-toggler-bar burger-lines" />
          <span className="navbar-toggler-bar burger-lines" />
        </button>
        <div
          className="collapse navbar-collapse justify-content-end"
          id="navigation"
        >
          <ul className="nav navbar-nav mr-auto">
          </ul>
          <ul className="navbar-nav ml-auto">
            <li className="nav-item">
              <a className="nav-link" href="#pablo">
                <span className="no-icon">Konto</span>
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#pablo">
                <span className="no-icon">Wyloguj się</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
}
