import React from 'react';
import {makeStyles} from '@material-ui/core/styles';
import Grid from '@material-ui/core/Grid';
import Container from '@material-ui/core/Container';
import MediaCard from "./beerCard";
import Buttons from "./buttons";


const useStyles = makeStyles(theme => ({
    root: {
        flexGrow: 1,
    },
    paper: {
        padding: theme.spacing(2),
        textAlign: 'center',
        color: theme.palette.text.secondary,
    },
}));

export default function CenteredGrid(props) {
    const classes = useStyles();
    return (
        <React.Fragment>
            <Container maxWidth="lg" style={{ height: '500px' }}>
                <div className={classes.root}>
                    <Grid container spacing={2}>
                        <Grid item xs={12} style={{ height: '100%'}}>
                            <MediaCard content={props.content}/>
                        </Grid>
                    </Grid>
                </div>
                <Buttons handleBeerChange={props.handleBeerChange}/>
            </Container>
        </React.Fragment>
    );
}
