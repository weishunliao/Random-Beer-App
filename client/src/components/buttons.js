import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Button from '@material-ui/core/Button';

const useStyles = makeStyles(theme => ({
    button: {
        margin: theme.spacing(3),
<<<<<<< HEAD
        height:"60px",
        width:"200px"
=======
        height: "60px",
        width: "200px"
>>>>>>> 63e9967fb0e30748f3e0970fec7fdfe6a1bbdbba
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
                Get your lucky beer!
            </Button>
        </div>
    );
}
