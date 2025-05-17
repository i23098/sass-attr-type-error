import React from 'react';
import * as ReactDOMClient from 'react-dom/client';
import App from './app'

const container = document.getElementById('react-container');
const root = ReactDOMClient.createRoot(container);
root.render(
  <React.StrictMode>
      <App />
  </React.StrictMode>
);
