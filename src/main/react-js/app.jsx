import "./app.scss"

import React from 'react';

export default function App(props) {
    return <select>
        <option
            value="123"
            className="option-with-color"
            data-color="#abcdef">
        With Color
        </option>
        <option value="456">No Color</option>
    </select>
}
