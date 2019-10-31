import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Button from '@material-ui/core/Button';

const useStyles = makeStyles(theme => ({
    button: {
        margin: theme.spacing(3),
        height: "60px",
        width: "200px"
    },
    input: {
        display: 'none',
    },
}));

export default function Buttons(props) {
    const classes = useStyles();

    return (
        <div style={{textAlign:"center"}}>
            <Button variant="contained" color="primary" className={classes.button} onClick={props.handleBeerChange}>
                Get YOUR LUCKY BEER!
            </Button>
        </div>
    );
}
